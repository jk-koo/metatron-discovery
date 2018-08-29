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

package app.metatron.discovery.domain.dataprep.exceptions;

public enum PrepMessageKey {
    MSG_DP_ALERT_INVALID_CONFIG_CODE(                            "msg.dp.alert.invalid.config.code"),
    MSG_DP_ALERT_REQUIRED_PROPERTY_MISSING(                      "msg.dp.alert.required.property.missing"),

    MSG_DP_ALERT_JDBC_CONNECTION_ERROR(                          "msg.dp.alert.jdbc.connection.error"),
    MSG_DP_ALERT_STAGINGDB_CONNECTION_ERROR(                     "msg.dp.alert.stagingdb.connection.error"),
    MSG_DP_ALERT_NO_DATAFLOW(                                    "msg.dp.alert.no.dataflow"),
    MSG_DP_ALERT_USING_OTHER_DATAFLOW(                                    "msg.dp.alert.using.other.dataflow"),
    MSG_DP_ALERT_NO_DATASET(                                     "msg.dp.alert.no.dataset"),
    MSG_DP_ALERT_NO_UPSTREAM(                                    "msg.dp.alert.no.upstream"),
    MSG_DP_ALERT_NO_SNAPSHOT(                                     "msg.dp.alert.no.snapshot"),
    MSG_DP_ALERT_NOT_IMPORTED_DATASET(                           "msg.dp.alert.not.imported.dataset"),
    MSG_DP_ALERT_HAS_NO_CREATOR_DATAFLOW(                        "msg.dp.alert.has.no.creator.dataflow"),
    MSG_DP_ALERT_HAS_NO_SHEET_NAME(                              "msg.dp.alert.has.no.sheet.name"),
    MSG_DP_ALERT_RULESTRING_NOT_FOUND(                           "msg.dp.alert.rulestring.not.found"),
    MSG_DP_ALERT_FAILED_TO_CALCULATE_ROWNO(                      "msg.dp.alert.failed.to.calculate.rowno"),
    MSG_DP_ALERT_PREP_FILE_TYPE_NOT_SUPPORTED(                   "msg.dp.alert.prep.file.type.not.supported"),
    MSG_DP_ALERT_FILE_FORMAT_WRONG(                   "msg.dp.alert.file.format.wrong"),

    MSG_DP_ALERT_TEDDY_PARSE_FAILED(                             "msg.dp.alert.teddy.parse.failed"),
    MSG_DP_ALERT_TEDDY_PARSE_FAILED_BY_RULENAME(                 "msg.dp.alert.teddy.parse.failed.by.rulename"),
    MSG_DP_ALERT_TEDDY_PARSE_FAILED_BY_MOVE_BEFORE_AND_AFTER(    "msg.dp.alert.teddy.parse.failed.by.move.before.and.after"),
    MSG_DP_ALERT_TEDDY_PARSE_FAILED_BY_MOVE_EXPRESSION(          "msg.dp.alert.teddy.parse.failed.by.move.expression"),
    MSG_DP_ALERT_TEDDY_PARSE_FAILED_BY_KEEP_EXPRESSION(          "msg.dp.alert.teddy.parse.failed.by.keep.expression"),
    MSG_DP_ALERT_TEDDY_PARSE_FAILED_BY_DELETE_EXPRESSION(        "msg.dp.alert.teddy.parse.failed.by.delete.expression"),
    MSG_DP_ALERT_TEDDY_PARSE_FAILED_BY_FLATTEN_COL(              "msg.dp.alert.teddy.parse.failed.by.flatten.col"),
    MSG_DP_ALERT_TEDDY_PARSE_FAILED_BY_HEADER_ROWNUM(              "msg.dp.alert.teddy.parse.failed.by.header.rownum"),
    MSG_DP_ALERT_TEDDY_PARSE_FAILED_BY_RENAME_COL(              "msg.dp.alert.teddy.parse.failed.by.rename.col"),
    MSG_DP_ALERT_TEDDY_PARSE_FAILED_BY_RENAME_TO(              "msg.dp.alert.teddy.parse.failed.by.rename.to"),
    MSG_DP_ALERT_TEDDY_PARSE_FAILED_BY_SORT_TYPE(                "msg.dp.alert.teddy.parse.failed.by.sort.type"),
    MSG_DP_ALERT_TEDDY_PARSE_FAILED_BY_SORT_ORDER(               "msg.dp.alert.teddy.parse.failed.by.sort.order"),
    MSG_DP_ALERT_TEDDY_PARSE_FAILED_BY_DROP_COL(                 "msg.dp.alert.teddy.parse.failed.by.drop.col"),
    MSG_DP_ALERT_TEDDY_PARSE_FAILED_BY_REPLACE_COL(         "msg.dp.alert.teddy.parse.failed.by.replace.col"),
    MSG_DP_ALERT_TEDDY_PARSE_FAILED_BY_REPLACE_ON(         "msg.dp.alert.teddy.parse.failed.by.replace.on"),
    MSG_DP_ALERT_TEDDY_PARSE_FAILED_BY_SETTYPE_COL(         "msg.dp.alert.teddy.parse.failed.by.settype.col"),
    MSG_DP_ALERT_TEDDY_PARSE_FAILED_BY_SETTYPE_TYPE(         "msg.dp.alert.teddy.parse.failed.by.settype.type"),
    MSG_DP_ALERT_TEDDY_PARSE_FAILED_BY_SETFORMAT_COL(         "msg.dp.alert.teddy.parse.failed.by.setformat.col"),
    MSG_DP_ALERT_TEDDY_PARSE_FAILED_BY_SETFORMAT_FORMAT(         "msg.dp.alert.teddy.parse.failed.by.setformat.format"),
    MSG_DP_ALERT_TEDDY_PARSE_FAILED_BY_SET_COL(         "msg.dp.alert.teddy.parse.failed.by.set.col"),
    MSG_DP_ALERT_TEDDY_PARSE_FAILED_BY_SET_VALUE(         "msg.dp.alert.teddy.parse.failed.by.set.value"),
    MSG_DP_ALERT_TEDDY_PARSE_FAILED_BY_COUNTPATTERN_COL(         "msg.dp.alert.teddy.parse.failed.by.countpattern.col"),
    MSG_DP_ALERT_TEDDY_PARSE_FAILED_BY_COUNTPATTERN_ON(         "msg.dp.alert.teddy.parse.failed.by.countpattern.on"),
    MSG_DP_ALERT_TEDDY_PARSE_FAILED_BY_DERIVE_AS(         "msg.dp.alert.teddy.parse.failed.by.derive.as"),
    MSG_DP_ALERT_TEDDY_PARSE_FAILED_BY_DERIVE_VALUE(         "msg.dp.alert.teddy.parse.failed.by.derive.value"),
    MSG_DP_ALERT_TEDDY_PARSE_FAILED_BY_MERGE_AS(         "msg.dp.alert.teddy.parse.failed.by.merge.as"),
    MSG_DP_ALERT_TEDDY_PARSE_FAILED_BY_MERGE_COL(         "msg.dp.alert.teddy.parse.failed.by.merge.col"),
    MSG_DP_ALERT_TEDDY_PARSE_FAILED_BY_MERGE_WITH(         "msg.dp.alert.teddy.parse.failed.by.merge.with"),
    MSG_DP_ALERT_TEDDY_PARSE_FAILED_BY_UNNEST_IDX(         "msg.dp.alert.teddy.parse.failed.by.unnest.idx"),
    MSG_DP_ALERT_TEDDY_PARSE_FAILED_BY_UNNEST_INTO(         "msg.dp.alert.teddy.parse.failed.by.unnest.into"),
    MSG_DP_ALERT_TEDDY_PARSE_FAILED_BY_EXTRACT_COL(         "msg.dp.alert.teddy.parse.failed.by.extract.col"),
    MSG_DP_ALERT_TEDDY_PARSE_FAILED_BY_EXTRACT_LIMIT(         "msg.dp.alert.teddy.parse.failed.by.extract.limit"),
    MSG_DP_ALERT_TEDDY_PARSE_FAILED_BY_EXTRACT_ON(         "msg.dp.alert.teddy.parse.failed.by.extract.on"),
    MSG_DP_ALERT_TEDDY_PARSE_FAILED_BY_AGGREGATE_GROUP(         "msg.dp.alert.teddy.parse.failed.by.aggregate.group"),
    MSG_DP_ALERT_TEDDY_PARSE_FAILED_BY_AGGREGATE_VALUE(         "msg.dp.alert.teddy.parse.failed.by.aggregate.value"),
    MSG_DP_ALERT_TEDDY_PARSE_FAILED_BY_SPLIT_COL(         "msg.dp.alert.teddy.parse.failed.by.split.col"),
    MSG_DP_ALERT_TEDDY_PARSE_FAILED_BY_SPLIT_LIMIT(         "msg.dp.alert.teddy.parse.failed.by.split.limit"),
    MSG_DP_ALERT_TEDDY_PARSE_FAILED_BY_SPLIT_ON(         "msg.dp.alert.teddy.parse.failed.by.split.on"),
    MSG_DP_ALERT_TEDDY_PARSE_FAILED_BY_NEST_AS(         "msg.dp.alert.teddy.parse.failed.by.nest.as"),
    MSG_DP_ALERT_TEDDY_PARSE_FAILED_BY_NEST_COL(         "msg.dp.alert.teddy.parse.failed.by.nest.col"),
    MSG_DP_ALERT_TEDDY_PARSE_FAILED_BY_NEST_INTO(         "msg.dp.alert.teddy.parse.failed.by.nest.into"),
    MSG_DP_ALERT_TEDDY_PARSE_FAILED_BY_PIVOT_COL(         "msg.dp.alert.teddy.parse.failed.by.pivot.col"),
    MSG_DP_ALERT_TEDDY_PARSE_FAILED_BY_PIVOT_GROUP(         "msg.dp.alert.teddy.parse.failed.by.pivot.group"),
    MSG_DP_ALERT_TEDDY_PARSE_FAILED_BY_PIVOT_VALUE(         "msg.dp.alert.teddy.parse.failed.by.pivot.value"),
    MSG_DP_ALERT_TEDDY_PARSE_FAILED_BY_UNPIVOT_COL(         "msg.dp.alert.teddy.parse.failed.by.unpivot.col"),
    MSG_DP_ALERT_TEDDY_PARSE_FAILED_BY_UNPIVOT_GROUPEVERY(         "msg.dp.alert.teddy.parse.failed.by.unpivot.groupevery"),
    MSG_DP_ALERT_TEDDY_PARSE_FAILED_BY_JOIN_DATASET2(         "msg.dp.alert.teddy.parse.failed.by.join.dataset2"),
    MSG_DP_ALERT_TEDDY_PARSE_FAILED_BY_JOIN_JOINTYPE(         "msg.dp.alert.teddy.parse.failed.by.join.jointype"),
    MSG_DP_ALERT_TEDDY_COLUMN_NOT_FOUND(                         "msg.dp.alert.teddy.column.not.found"),
    MSG_DP_ALERT_TEDDY_NOT_SUPPORTED_TYPE(                       "msg.dp.alert.teddy.not.supported.type"),
    MSG_DP_ALERT_TEDDY_QUERY_FAILED(                             "msg.dp.alert.teddy.query.failed"),
    MSG_DP_ALERT_TEDDY_INVALID_FUNCTION_ARGS(                    "msg.dp.alert.teddy.invalid.function.args"),
    MSG_DP_ALERT_TEDDY_INVALID_FUNCTION_TYPE(                    "msg.dp.alert.teddy.invalid.function.type"),
    MSG_DP_ALERT_TEDDY_UNSUPPORTED_CONSTANT_TYPE(                "msg.dp.alert.teddy.unsupported.constant.type"),
    MSG_DP_ALERT_TEDDY_CANNOT_CAST_TO(                           "msg.dp.alert.teddy.cannot.cast.to"),
    MSG_DP_ALERT_TEDDY_CANNOT_CAST_FROM(                         "msg.dp.alert.teddy.cannot.cast.from"),
    MSG_DP_ALERT_TEDDY_UNKNOWN_TYPE(                             "msg.dp.alert.teddy.unknown.type"),
    MSG_DP_ALERT_TEDDY_TYPE_MISMATCH(                            "msg.dp.alert.teddy.type.mismatch"),
    MSG_DP_ALERT_TEDDY_DIFFERENT_TYPE(                           "msg.dp.alert.teddy.different.type"),
    MSG_DP_ALERT_TEDDY_NO_ROW(                                   "msg.dp.alert.teddy.no.row"),
    MSG_DP_ALERT_TEDDY_JOIN_TYPE_NOT_SUPPORTED(                  "msg.dp.alert.teddy.join.type.not.supported"),
    MSG_DP_ALERT_TEDDY_LEFT_PREDICATE_NOT_FOUND(                 "msg.dp.alert.teddy.left.predicate.not.found"),
    MSG_DP_ALERT_TEDDY_RIGHT_PREDICATE_NOT_FOUND(                "msg.dp.alert.teddy.right.predicate.not.found"),
    MSG_DP_ALERT_TEDDY_PREDICATE_TYPE_MISMATCH(                  "msg.dp.alert.teddy.predicate.type.mismatch"),
    MSG_DP_ALERT_TEDDY_NO_LIMIT(                                 "msg.dp.alert.teddy.works.no.limit"),
    MSG_DP_ALERT_TEDDY_WORKS_ONLY_ON_STRING(                     "msg.dp.alert.teddy.works.only.on.string"),
    MSG_DP_ALERT_TEDDY_WORKS_ONLY_ON_NUMERIC(                    "msg.dp.alert.teddy.works.only.on.numeric"),
    MSG_DP_ALERT_TEDDY_ILLEGAL_PATTERN_TYPE(                     "msg.dp.alert.teddy.illegal.pattern.type"),
    MSG_DP_ALERT_TEDDY_WRONG_TARGET_COLUMN_EXPRESSION(           "msg.dp.alert.teddy.wrong.target.column.expression"),
    MSG_DP_ALERT_TEDDY_WORKS_ONLY_ON_ARRAY_OR_MAP(               "msg.dp.alert.teddy.works.only.on.array.or.map"),
    MSG_DP_ALERT_TEDDY_WORKS_ONLY_ON_ARRAY(                      "msg.dp.alert.teddy.works.only.on.array"),
    MSG_DP_ALERT_TEDDY_INVAILD_INDEX_TYPE(                       "msg.dp.alert.teddy.invalid.index.type"),
    MSG_DP_ALERT_TEDDY_IDX_ON_MAPTYPE_SHOULD_BE_STRING(          "msg.dp.alert.teddy.idx.on.maptype.should.be.string"),
    MSG_DP_ALERT_TEDDY_WRONG_ARRAY_INDEX(                        "msg.dp.alert.teddy.wrong.array.index"),
    MSG_DP_ALERT_TEDDY_INVALID_JSON(                             "msg.dp.alert.teddy.invalid.json"),
    MSG_DP_ALERT_TEDDY_WRONG_MAP_KEY(                            "msg.dp.alert.teddy.wrong.map.key"),
    MSG_DP_ALERT_TEDDY_NO_INPUT_COLUMN_DESIGNATED(               "msg.dp.alert.teddy.no.input.column.designated"),
    MSG_DP_ALERT_TEDDY_ILLEGAL_AGGREGATION_FUNCTION_EXPRESSION(  "msg.dp.alert.teddy.illegal.aggregation.function.expression"),
    MSG_DP_ALERT_TEDDY_TARGET_COLUMN_NOT_FOUND(                  "msg.dp.alert.teddy.target.column.not.found"),
    MSG_DP_ALERT_TEDDY_GROUPBY_COLUMN_NOT_FOUND(                 "msg.dp.alert.teddy.target.groupby.column.not.found"),
    MSG_DP_ALERT_TEDDY_INVALID_COLUMN_EXPRESSION_TYPE(           "msg.dp.alert.teddy.invalid.column.expression.type"),
    MSG_DP_ALERT_TEDDY_INVALID_AGGREGATION_VALUE_EXPRESSION_TYPE("msg.dp.alert.teddy.invalid.aggregation.value.exprssion.type"),
    MSG_DP_ALERT_TEDDY_COLUMN_TYPE_SHOULD_BE_DOUBLE_OR_LONG(     "msg.dp.alert.teddy.column.type.should.be.double.or.long"),
    MSG_DP_ALERT_TEDDY_UNSUPPORTED_AGGREGATION_FUNCTION(         "msg.dp.alert.teddy.unsupported.aggregation.function"),
    MSG_DP_ALERT_TEDDY_WRONG_AGGREGATION_FUNCTION_EXPRESSION(    "msg.dp.alert.teddy.wrong.aggregation.function.expresstion"),
    MSG_DP_ALERT_TEDDY_TOO_MANY_PIVOTED_COLUMNS(                 "msg.dp.alert.teddy.too.many.pivoted.columns"),
    MSG_DP_ALERT_TEDDY_WRONG_GROUPEVERY_COUNT(                   "msg.dp.alert.teddy.wrong.groupevery.count"),
    MSG_DP_ALERT_TEDDY_NEED_BEFORE_OR_AFTER(                     "msg.dp.alert.teddy.need.before.or.after"),
    MSG_DP_ALERT_TEDDY_WRONG_TARGET_POSITION(                    "msg.dp.alert.teddy.wrong.target.position"),
    MSG_DP_ALERT_TEDDY_RULE_NOT_SUPPORTED(                       "msg.dp.alert.teddy.rule.not.supported"),
    MSG_DP_ALERT_TEDDY_OUT_OF_BOUND(                             "msg.dp.alert.teddy.out.of.bound"),
    MSG_DP_ALERT_TEDDY_WRONG_SUBSTRING_INDEX_PARAM(              "msg.dp.alert.teddy.wrong.substring.index.param"),
    MSG_DP_ALERT_TEDDY_TIMESTAMP_FORMAT_MISMATCH(                "msg.dp.alert.teddy.timestamp.format.mismatch"),
    MSG_DP_ALERT_TEDDY_WORKS_ONLY_ON_TIMESTAMP(                  "msg.dp.alert.teddy.works.only.on.timestamp"),
    MSG_DP_ALERT_TEDDY_INVALID_DELTA_VALUE(                      "msg.dp.alert.teddy.invalid.delta.value"),
    MSG_DP_ALERT_TEDDY_INVALID_TIMESTAMP_UNIT(                   "msg.dp.alert.teddy.invalid.timestamp.unit"),
    MSG_DP_ALERT_TEDDY_INVALID_TIMEZONE_ID(                      "msg.dp.alert.teddy.invalid.timezone.id"),
    MSG_DP_ALERT_TEDDY_INVALID_COLUMN_NAME_EXPRESSION(           "msg.dp.alert.teddy.invalid.column.name.expression"),
    MSG_DP_ALERT_TEDDY_ILLEGAL_COLUMN_NAME_FOR_HIVE(             "msg.dp.alert.teddy.illegal.column.name.for.hive"),
    MSG_DP_ALERT_TEDDY_TRANSFORM_TIMEOUT(                        "msg.dp.alert.teddy.transform.timeout"),
    MSG_DP_ALERT_TEDDY_TRANSFORM_EXECUTION_FAILED(               "msg.dp.alert.teddy.transform.execution.failed"),
    MSG_DP_ALERT_TEDDY_TRANSFORM_EXECUTION_INTERRUPTED(          "msg.dp.alert.teddy.transform.execution.interrupted"),
    MSG_DP_ALERT_TEDDY_NO_ASSIGNMENT_STATEMENT_IS_ALLOWED(                 "msg.dp.alert.teddy.no.assignment.statement.is.allowed"),
    MSG_DP_ALERT_TRANSFORM_SNAPSHOT_FAILED(                      "msg.dp.alert.snapshot.failed"),
    MSG_DP_ALERT_SNAPSHOT_NOT_SAVED(                      "msg.dp.alert.snapshot.not.saved"),
    MSG_DP_ALERT_TEDDY_WRONG_WINDOW_FUNCTION_EXPRESSION(         "msg.dp.alert.teddy.wrong.window.function.expression"),

    MSG_DP_ALERT_UNKOWN_ERROR(                                   "msg.dp.alert.unknown.error");

    String message_key;

    PrepMessageKey(String message_key) {
        this.message_key = message_key;
    }

    public String getMessageKey() {
        return this.message_key;
    }
}