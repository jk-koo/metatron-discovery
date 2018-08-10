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

package app.metatron.discovery.spec.druid.ingestion.tuning;

import app.metatron.discovery.spec.druid.ingestion.partition.PartitionSpec;

/**
 * Created by kyungtaak on 2016. 6. 17..
 */
public class BatchTuningConfig implements TuningConfig {

  String workingPath;

  String version;

  PartitionSpec partitionSpec;

  Integer maxRowsInMemory;

  Boolean leaveIntermediate;

  Boolean cleanupOnFailure;

  Boolean overwriteFiles;

  Boolean ignoreInvalidRows;

  Boolean useCombiner;

  Boolean buildV9Directly;

  Integer numBackgroundPersistThreads;

  Object jobProperties;

  public BatchTuningConfig() {
  }

  public static BatchTuningConfig defaultConfig() {
    BatchTuningConfig config = new BatchTuningConfig();
    config.setIgnoreInvalidRows(true);
    config.setMaxRowsInMemory(75000);
    config.setBuildV9Directly(true);

    return config;
  }

  public String getWorkingPath() {
    return workingPath;
  }

  public void setWorkingPath(String workingPath) {
    this.workingPath = workingPath;
  }

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public PartitionSpec getPartitionSpec() {
    return partitionSpec;
  }

  public void setPartitionSpec(PartitionSpec partitionSpec) {
    this.partitionSpec = partitionSpec;
  }

  public Integer getMaxRowsInMemory() {
    return maxRowsInMemory;
  }

  public void setMaxRowsInMemory(Integer maxRowsInMemory) {
    this.maxRowsInMemory = maxRowsInMemory;
  }

  public Boolean getLeaveIntermediate() {
    return leaveIntermediate;
  }

  public void setLeaveIntermediate(Boolean leaveIntermediate) {
    this.leaveIntermediate = leaveIntermediate;
  }

  public Boolean getCleanupOnFailure() {
    return cleanupOnFailure;
  }

  public void setCleanupOnFailure(Boolean cleanupOnFailure) {
    this.cleanupOnFailure = cleanupOnFailure;
  }

  public Boolean getOverwriteFiles() {
    return overwriteFiles;
  }

  public void setOverwriteFiles(Boolean overwriteFiles) {
    this.overwriteFiles = overwriteFiles;
  }

  public Boolean getIgnoreInvalidRows() {
    return ignoreInvalidRows;
  }

  public void setIgnoreInvalidRows(Boolean ignoreInvalidRows) {
    this.ignoreInvalidRows = ignoreInvalidRows;
  }

  public Boolean getUseCombiner() {
    return useCombiner;
  }

  public void setUseCombiner(Boolean useCombiner) {
    this.useCombiner = useCombiner;
  }

  public Boolean getBuildV9Directly() {
    return buildV9Directly;
  }

  public void setBuildV9Directly(Boolean buildV9Directly) {
    this.buildV9Directly = buildV9Directly;
  }

  public Integer getNumBackgroundPersistThreads() {
    return numBackgroundPersistThreads;
  }

  public void setNumBackgroundPersistThreads(Integer numBackgroundPersistThreads) {
    this.numBackgroundPersistThreads = numBackgroundPersistThreads;
  }

  public Object getJobProperties() {
    return jobProperties;
  }

  public void setJobProperties(Object jobProperties) {
    this.jobProperties = jobProperties;
  }
}
