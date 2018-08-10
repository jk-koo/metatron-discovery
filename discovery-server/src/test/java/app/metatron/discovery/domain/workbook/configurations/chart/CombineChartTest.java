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

package app.metatron.discovery.domain.workbook.configurations.chart;

import com.fasterxml.jackson.core.JsonProcessingException;

import org.junit.Test;

import app.metatron.discovery.common.GlobalObjectMapper;

/**
 * Created by kyungtaak on 2016. 4. 18..
 */
public class CombineChartTest extends ChartTest {

  @Test
  public void de_serialize() throws JsonProcessingException {

    // 범례
    //
    ChartLegend legend = new ChartLegend();

    ChartAxis xAxis = new ChartAxis(true, "test", true, null, null, null);
    ChartAxis yAxis = new ChartAxis(true, null, true, null, null, null);

    CombineChart chart = new CombineChart(colorByMeasureForSection(), valueNumberFormat(), legend, null, fontLargerSize(), combineDataLabel(), null,
                                  CombineChart.BarMarkType.STACKED.name(), CombineChart.LineMarkType.AREA.name(),
                                  xAxis, yAxis);

    String combineChartStr = GlobalObjectMapper.writeValueAsString(chart);

    System.out.println(combineChartStr);

    Chart deSerialized = GlobalObjectMapper.readValue(combineChartStr, Chart.class);

    System.out.println("Result : " + deSerialized.toString());

  }

}
