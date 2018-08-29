drop table test_cleansing;
create table test_cleansing (contract_id string, cdate string, user_id string, prod_code string,
                             store_code string, birth_date string, nationality string);
insert into test_cleansing values
("cid000000007","2015-05-15","uid0035874","04_04_003_0010","1044","1972-02-07","USA"),
("cid000000009","2016-08-07","uid0040954","02_01_004_0036","1773","1972-08-06","USA"),
("cid000000016","2015-12-18","uid0110866","01_02_002_0040","0367","1973-08-17","USA"),
("cid000000046","2013-04-19","uid0068093","02_01_005_0015","1729","1970-04-08","US"),
("cid000000050","2015-12-19","uid0113791","02_04_002_0009","1566","1971-11-09","united states of america"),
("cid000000051","2015-07-09","uid0014221","01_01_001_0016","1279","1974-03-18","Trump world"),
("cid000000085","2015-03-18","uid0133515","01_01_001_0018","1825","1974-08-01","states"),
("cid000000098","2014-11-18","uid0143419","04_02_003_0024","0156","1971-07-22","united states"),
("cid000000099","2011/08/08","uid0016692","01_03_001_0041","0917","1973-05-12","USA"),
("cid000000102","2011/08/22","uid0129148","03_01_004_0025",null,null,"KOREA"),
("cid000000109","2014-09-05","uid0116023","02_03_004_0033","1033","1972-02-04","KOREA"),
("cid000000110","2012/04/17","uid0178305","04_05_004_0015","0731","1974-06-18","Korea"),
("cid000000112","2016-05-13","uid0074442","03_01_005_0044","0551","1972-08-25","Corea"),
("cid000000141","2012/06/18","uid0091698","03_01_005_0047","0293","1974-11-19","ROK"),
("cid000000144","2012/03/08","uid0136989","03_03_004_0037","1755","1971-12-04","Republic of Korea"),
("cid000000147","2015-01-24","uid0071254","03_02_003_0020",null,"1974-04-24","South Korea"),
("cid000000154","2010/10/25","uid0118075","03_01_004_0022","1515","1979-04-02","Korean (south of)"),
("cid000000156","2010/01/25","uid0132635","03_03_004_0023","0270","1970-09-17","USA"),
("cid000000158","2010/06/19","uid0186788","02_03_002_0032","1467","1972-06-07","USA"),
("cid000000273","2016-01-11","uid0046672","04_04_002_0040","0655","1973-05-20","USA"),
("cid000000282","2014-08-13","uid0089361",null,null,null,null),
("cid000000297","2016-04-22","uid0169836","04_03_003_0004","0682","1971-03-13","united state"),
("cid000000300","2013-04-10","uid0106283","02_02_002_0013","1893","1973-10-28","USA"),
("cid000000313","2013-01-22","uid0032207","01_02_001_0016","N/A","1970-08-20","USA"),
("cid000000316","2012/08/19","uid0037415","01_05_002_0045","NULL","1978-06-05","KOREA"),
("cid000000321","2013-03-14","uid0086747","03_02_005_0031","null","1972-06-03","KOREA"),
("cid000000328","2015-06-24","uid0150717","04_02_004_0007","-","1972-02-01","USA"),
("cid000000356","2013-08-03","uid0005461","01_01_003_0015","","1971-03-28","USA"),
("cid000000357","2014-05-05","uid0059512","02_03_001_0037","","1972-09-04","KOREA"),
("cid000000368","2014-11-26","uid0108511","02_04_002_0026","0601","1970-01-22","USA");