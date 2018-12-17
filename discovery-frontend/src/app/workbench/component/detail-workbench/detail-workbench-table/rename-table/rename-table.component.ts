/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
import {Component, ElementRef, EventEmitter, Injector, Input, OnDestroy, OnInit, Output} from '@angular/core';
import {DataconnectionService} from "../../../../../dataconnection/service/dataconnection.service";
import {StringUtil} from "../../../../../common/util/string.util";
import {AbstractPopupComponent} from "../../../../../common/component/abstract-popup.component";
import {Alert} from "../../../../../common/util/alert.util";

@Component({
  selector: 'app-rename-table',
  templateUrl: './rename-table.component.html',
})
export class RenameTableComponent extends AbstractPopupComponent implements OnInit, OnDestroy {
  public isInvalidTableName: boolean = false;
  public errMsgTableName: string = '';

  public tableName: string = '';

  @Input()
  public webSocketId: string = '';

  @Input()
  public dataConnectionId: string = '';

  @Input()
  public database: string = '';

  @Input()
  public renameTable: string = '';

  @Output()
  renameSucceed = new EventEmitter<string>();

  // 생성자
  constructor(private dataconnectionService: DataconnectionService,
              protected elementRef: ElementRef,
              protected injector: Injector) {
    super(elementRef, injector);
  }

  /*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
   | Override Method
   |-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=*/

  // Init
  public ngOnInit() {
    // Init
    super.ngOnInit();

    this.tableName = this.renameTable;
  }

  // Destory
  public ngOnDestroy() {

    // Destory
    super.ngOnDestroy();
  }

  public validation() {
    if (StringUtil.isEmpty(this.tableName)) {
      this.isInvalidTableName = true;
      this.errMsgTableName = this.translateService.instant('msg.common.ui.required');
      return false;
    } else {
      if(StringUtil.isAlphaNumericUnderscore(this.tableName) === false) {
        this.isInvalidTableName = true;
        this.errMsgTableName = this.translateService.instant('msg.bench.alert.invalid-hive-name-rule', {value: 'Table'});
        return false;
      }

      if(this.tableName.trim() === this.renameTable.trim()) {
        this.isInvalidTableName = true;
        this.errMsgTableName = this.translateService.instant('msg.bench.alert.invalid-table-name');
        return false;
      }
    }

    return true;
  }

  public saveToHive() {
    if (this.validation()) {
      this.loadingShow();
      this.dataconnectionService.renameTable(this.dataConnectionId, this.database, this.renameTable, this.tableName, this.webSocketId)
        .then((response) => {
          this.loadingHide();
          Alert.success(this.translateService.instant('msg.comm.alert.modify.success'));
          this.renameSucceed.emit();
          this.close();
        }).catch((error) => {
        this.loadingHide();
        console.log(error);
        Alert.error(this.translateService.instant('msg.comm.alert.save.fail'));
      });
    }
  }
}
