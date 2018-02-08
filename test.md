**百旺自助终端资源申请**

（终端类型包括：定额发售、增值税发售、专普票代开、认证、申报）

防伪税控正式环境数据接口
========================

| 防伪税控数据库 | IP地址：                |      |                                                            |
|----------------|-------------------------|------|------------------------------------------------------------|
|                | SID或SERVICE_NAME：     |      |                                                            |
|                | PORT：                  |      |                                                            |
|                | 用户名：                |      |                                                            |
|                | 密码：                  |      |                                                            |
| 专票代开       | 对象                    | 权限 | 用途                                                       |
|                | HTJS.HT_YBNSR_DAB       | 查询 | 查询纳税人所在税务机关                                     |
|                | P_GET_FWSK_BSXX_HMDYJ   | 执行 | 获取需要验旧的发票信息                                     |
|                | HTJS.WL_FP              | 查询 | 查询代开发票信息                                           |
|                | HTJS.WL_FP_ZB           | 查询 | 查询代开发票明细信息                                       |
|                | WBJK_WLFP_INS_DATA      | 执行 | 同步代开发票信息到防伪税控                                 |
| 普票代开       | HTJS.WL_PP              | 查询 | 查询发票信息                                               |
|                | HTJS.WL_PP_ZB           | 查询 | 查询发票信息                                               |
|                | WBJK_WLFP_PTFP_INS_DATA | 执行 | 同步代开普通发票信息到防伪税控                             |
| 认证           | HTJS.HT_YBNSR_DAB       | 查询 | 查询发票所属税务机关 (专票代开已申请过)                    |
|                | HTJS.FP_SKFP_HZ         | 查询 | 查询企业开户信息，及同步防伪税控                           |
|                | HTJS.WSRZ_QY_KHXX       | 查询 | 查询认证发票抵扣联明细，及认证通过后同步到防伪税控         |
|                | HTJS.RZ_FPDKL_MX        | 查询 | 查询认证发票抵扣联明细清单，及认证通过后同步到防伪税控     |
|                | HTJS.RZ_FPDKL_MX_QD     | 查询 | 查询认证发票抵扣联明细清单明细，及认证通过后同步到防伪税控 |
|                | HTJS.RZ_FPDKL_MX_QDMX   | 查询 | 认证通过后同步到防伪税控                                   |
|                | HTJS.RZ_FDKFP_YZ_MX     | 查询 | 认证通过后同步到防伪税控                                   |
|                | HTJS.RZ_FDKFP_YZ_MX_QD  | 查询 | 查询企业开户信息                                           |
|                | HTJS.CB_FPCGL_MX        | 查询 | 发票存根联明细                                             |

货运后台数据库
==============

| 货运后台数据库 | IP地址：                      |        |                            |
|----------------|-------------------------------|--------|----------------------------|
|                | SID或SERVICE_NAME：           |        |                            |
|                | PORT：                        |        |                            |
|                | 用户名：                      |        |                            |
|                | 密码：                        |        |                            |
| 认证           | 对象                          | 权限   | 用途                       |
|                | SKSKJ.SM_SKSKJDK_JG           | 查，增 | 查询认证结果，同步认证结果 |
|                | SKSKJ.SM_SKSKJDK_JG_ZB        | 查，增 | 查询认证结果，同步认证结果 |
|                | SKSKJ.SM_SKSKJDK_YHSBH        | 查     | 查询纳税人信息             |
|                | SKSKJ.DM_GY_SWJG              | 查     | 查询税务机关信息           |
|                | SKSKJ.PKG_IN_HYFP_WSBS_WSRZ包 | 执行   | 进行发票明文密文比对       |
|                | SKSKJ.DJ_SKSKJDK_HMDGL        | 查     | 查询发票代码号码合法性     |
| 验旧           | SKSKJ.P_GET_HYZZS_FPYJ        | 执行   | 发票验旧信息               |

货运大厅认证地址、账号
======================

| 货运大厅认证地址                            |   |
|---------------------------------------------|---|
| 货运大厅认证登陆账号/密码(需要省级用户权限) |   |

航信解密机地址，端口
====================

| IP地址： |   |
|----------|---|
| 端口号： |   |

货运发行代理地址，端口
======================

| IP地址： |   |
|----------|---|
| 端口号： |   |

金三正式环境数据接口
====================

| 金三数据库   | IP地址：                        |      |                                      |
|--------------|---------------------------------|------|--------------------------------------|
|              | SID或SERVICE_NAME：             |      |                                      |
|              | PORT：                          |      |                                      |
|              | 用户名：                        |      |                                      |
|              | 密码：                          |      |                                      |
| 发票发售终端 | 对象                            | 权限 | 用途                                 |
|              | HX_DJ.DJ_NSRXX_KZ               | 查询 | 查询纳税人扩展信息                   |
|              | HX_DJ.DJ_NSRXX                  | 查询 | 查询纳税人信息                       |
|              | HX_RD.RD_NSRZGXX_JGB            | 查询 | 查询纳税人资格认定信息               |
|              | HX_RD.RD_SFZRDXXB               | 查询 | 查询纳税人税费种认定信息             |
|              | HX_FP.FP_LY                     | 查询 | 查询纳税人发票领用信息               |
|              | HX_FP.FP_LY_MX                  | 查询 | 查询纳税人发票领用明细               |
|              | HX_FP.FP_TP                     | 查询 | 查询纳税人发票退库信息               |
|              | HX_FP.FP_TP_MX                  | 查询 | 查询纳税人发票退库明细               |
|              | HX_FP.FP_PZHDGPRXX              | 查询 | 票种核定购票人信息                   |
|              | HX_FP.FP_PZHDXX                 | 查询 | 发票票种核定信息表                   |
|              | HX_ZS.ZS_HD_DQDEHD_JG           | 查询 | 查询定期定额结果表                   |
|              | HX_CS_ZDY.CS_GY_SJZHDZB         | 查询 | 税务机关参数对照表                   |
|              | HX_CS_ZDY.QX_SWJG_GW            | 查询 | 查询税务机关岗位                     |
|              | HX_FP.FP_SWXZXK                 | 查询 | 查询税务行政许可信息                 |
|              | HX_FP.FP_SWXZXK_ZGXE            | 查询 | 查询税务行政许可信息                 |
|              | HX_FP.FP_SWXZXK_ZGXE_SQSP       | 查询 | 查询税务行政许可信息                 |
|              | HX_FP.FP_SWXZXK_SQXX            | 查询 | 查询税务行政许可信息                 |
| 发票代开     | HX_FP.FP_DK_SQ                  | 查询 | 发票代开申请表                       |
|              | HX_FP.FP_DK_ZZSFP               | 查询 | 查询发票代开增值税发票信息           |
|              | HX_FP.FP_DK_ZZSPTFP             | 查询 | 查询发票代开增值税普通发票信息       |
|              | HX_FP.FP_DK_ZZSFP_HLMX          | 查询 | 查询发票代开增值税专用发票货劳明细表 |
|              | HX_FP.FP_DK_ZZSPTFP_HLMX        | 查询 | 查询发票代开增值税普通发票货劳明细表 |
|              | HX_FP.FP_DK_SFMX                | 查询 | 查询税费明细表                       |
|              | HX_FP.FP_DK_YSYSKMX             | 查询 | 发票代开已使用税款明细表             |
|              | HX_FP.FP_DK_FPKJXX              | 查询 | 查询发票代开开具信息表               |
|              | HX_ZS.ZS_SKY_SFXY               | 查询 | 查询三方协议登记信息                 |
|              | HX_ZS.ZS_HD_QTSZHD_JG           | 查询 | 查询其他税种核定信息                 |
|              | HX_DM_ZDY.DM_KJ_JYGZ            | 查询 | 校验规则代码表                       |
|              | HX_DM_ZDY.DM_GY_JDXZ            | 查询 | 街道乡镇代码表                       |
|              | HX_DM_ZDY.DM_GY_SWJG            | 查询 | 查询税务机关表                       |
|              | HX_DM_ZDY.DM_GY_SWRY            | 查询 | 查询税务人员表                       |
|              | HX_DM_QG.DM_GY_JLDW             | 查询 | 查询计量单位代码表信息               |
|              | HX_DM_QG.DM_GY_YHHB             | 查询 | 查询银行名称信息                     |
|              | HX_DM_QG.DM_GY_ZSXM             | 查询 | 征收项目代码表                       |
|              | HX_DM_QG.DM_GY_ZSPM             | 查询 | 征收品目代码表                       |
|              | HX_DM_QG.DM_GY_XZQH             | 查询 | 行政区划代码表                       |
|              | HX_DM_QG.DM_GY_HY               | 查询 | 行业代码表                           |
|              | HX_DM_QG.DM_GY_GJHDQ            | 查询 | 查询国家地区                         |
|              | HX_DM_QG.DM_GY_SFZJLX           | 查询 | 查询身份证件类型                     |
|              | HX_DM_QG.DM_FP_FPZL             | 查询 | 查询发票种类                         |
|              | HX_DM_QG.DM_PZ_PZZL             | 查询 | 查询票证种类                         |
|              | HX_CS_ZDY.CS_PZ_PZZGB           | 查询 | 查询票证字轨                         |
|              | GS_CXTJ.DJ_ZRR                  | 查询 | 查询登记自然人信息表                 |
|              | HX_DJ.DJ_DJHGLGL                | 查询 | 查询登记户归类信息                   |
|              | HX_DJ.DJ_HWYSXGMDKZZSFP         | 查询 | 查询异地代开发票                     |
|              | HX_SB.SB_SBBD_ZZSYBNSR_YCSBDYGZ | 查询 | 增值税一般纳税人一窗式比对           |
| 车购税       | 终端已申请                      |      |                                      |
|              | HX_DJ.DJ_NSRXX                  | 查询 | 查询纳税人信息                       |
|              | HX_DJ.DJ_NSRXX_KZ               | 查询 | 查询纳税人扩展信息                   |
|              | GS_CXTJ.DJ_ZRR                  | 查询 | 查询登记自然人信息                   |
|              | HX_DM_ZDY.DM_GY_SWJG            | 查询 | 查询税务机关信息                     |
|              | HX_DM_QG.DM_PZ_PZZL             | 查询 | 票证种类代码                         |
|              | HX_CS_ZDY.CS_PZ_PZZGB           | 查询 | 票证字轨表                           |
|              | HX_FP.FP_PZHDGPRXX              | 查询 | 发票票种核定购票人信息               |
|              | 车购税新增                      |      |                                      |
|              | HX_DM_ZDY.DM_GY_GK              | 查询 | 查询国库信息                         |
|              | HX_CS_ZDY.CS_ZS_SWJGGKDZB       | 查询 | 查询税务机关国库对照表               |
|              | HX_SB.SB_CGS_SBBXBLSB           | 查询 | 车辆购置税纳税申报表                 |
| 辽宁新增     | HX_DM_ZDY.DM_GY_YSFPBL          | 查询 | 预算分配比例代码表                   |
|              | HX_DM_QG.DM_DJ_DJZCLX           | 查询 | 登记注册类型代码表                   |

金三正式环境应用接口
====================

| EJB协议类型接入                  | OSB访问核心征管后端的系统编码（CHANNEL_ID）： |                                                                                      |                                                                              |
|----------------------------------|-----------------------------------------------|--------------------------------------------------------------------------------------|------------------------------------------------------------------------------|
|                                  | OSB访问核心征管后端的URL：                    |                                                                                      |                                                                              |
|                                  | 上下文工厂：                                  | weblogic.jndi.WLInitialContextFactory                                                |                                                                              |
|                                  | JNDI名：                                      | gt3.esb.ejb.AipEJBAdapter.NF.JEJB\#gt3.esb.ejb.adapter.client.IEsbXmlMessageReceiver |                                                                              |
| 调用服务接口如下：               |                                               |                                                                                      |                                                                              |
| 发票发售                         |                                               |                                                                                      |                                                                              |
|                                  | HXZG_FP_00050                                 | SWZJ.HXZG.FP.CSHFPFSYW                                                               | 效检发售条件及提取基本信息初始化业务                                         |
|                                  | HXZG_FP_00051                                 | SWZJ.HXZG.FP.BCFSXX                                                                  | 保存发售信息                                                                 |
|                                  | HXZG_FP_00279                                 | SWZJ.HXZG.FP.CXNSRFPJC                                                               | 根据登记序号等条件查询纳税人发票结存                                         |
|                                  | HXZG_FP_00057                                 | SWZJ.HXZG.FP.BCFPYJJXX                                                               | 保存发票验交旧信息                                                           |
|                                  | HXZG_FP_00054                                 | SWZJ.HXZG.FP.BCFPTKCZ                                                                | 保存发票退库操作                                                             |
|                                  | HXZG_FP_15087                                 | SWZJ.HXZG.FP.FXXPBZ                                                                  | 发票领用返写写盘标志                                                         |
|                                  | HXZG_FP_15159                                 | SWZJ.HXZG.FP.BCLYXX                                                                  | 保存领用信息                                                                 |
| 发票代开                         |                                               |                                                                                      |                                                                              |
|                                  | HXZG_FP_10000                                 | SWZJ.HXZG.FP.CXWJKDKSQLB                                                             | 根据登记序号查询未开具的代开申请列表                                         |
|                                  | HXZG_FP_10002                                 | SWZJ.HXZG.FP.ZFDKFP                                                                  | 作废代开的发票                                                               |
|                                  | HXZG_FP_10011                                 | SWZJ.HXZG.FP.ZFDKSQ                                                                  | 作废代开申请信息                                                             |
|                                  | HXZG_FP_10026                                 | SWZJ.HXZG.FP.BCDKSQZZS                                                               | 保存代开申请信息(增值税)                                                     |
|                                  | HXZG_FP_10021                                 | SWZJ.HXZG.FP.CSHFPDKSQZZS                                                            | 校验并提取代开相关基本信息初始化代开申请业务(增值税)                         |
|                                  | HXZG_FP_10016                                 | SWZJ.HXZG.FP.BCDKSQSHJG                                                              | 保存代开申请审核                                                             |
|                                  | HXZG_FP_10013                                 | SWZJ.HXZG.FP.KJDKFP                                                                  | 开具代开发票                                                                 |
|                                  | HXZG_ZS_10040                                 | SWZJ.HXZG.ZS.DKFPSSKK                                                                | 代开发票实时扣款                                                             |
|                                  | HXZG_FP_10014                                 | SWZJ.HXZG.FP.CXDKWKJFPLB                                                             | 根据税务人员代码查询发票代开柜台库存未开具的发票信息列表                     |
|                                  | HXZG_ZS_00996                                 | SWZJ.HXZG.ZS.CXSFXYXXBYDJXH                                                          | 根据登记序号获取三方协议信息                                                 |
|                                  | HXZG_FP_15006                                 | SWZJ.HXZG.FP.CXDKSQXX                                                                | 查询代开申请信息                                                             |
|                                  | HXZG_FP_10033                                 | SWZJ.HXZG.FP.CSHDKKJZZS                                                              | 校验并提取代开申请信息初始化代开开具业务(增值税)                             |
|                                  | HXZG_ZS_00377                                 | SWZJ.HXZG.ZS.CXNSRWQJQSFXX                                                           | 根据登记序号查询纳税人未清缴（欠税费）信息                                   |
|                                  | HXZG_FP_15155                                 | SWZJ.HXZG.FP.BCDKSQZZSPTFP                                                           | 保存增值税普通发票代开申请                                                   |
|                                  | HXZG_FP_15003                                 | SWZJ.HXZG.FP.CXYJSFKPXX                                                              | 根据登记序号、代开发票类别提供税费明细信息供预缴开票                         |
|                                  | HXZG_ZS_10043                                 | SWZJ.HXZG.ZS.DYYHDJKPZFPDKSQ                                                         | 打印银行端缴款凭证(发票代开申请)                                             |
|                                  | HXZG_ZS_10028                                 | SWZJ.HXZG.ZS.SKYDZSPKKZTCX                                                           | 税库银电子税票扣款状态查询（实时扣款，批量扣款，银行端缴款，POS刷卡）        |
|                                  | HXZG_DJ_00489                                 | SWZJ.HXZG.DJ.ZRRJJDJ                                                                 | 自然人间接登记                                                               |
| 个体/小规模增值税申报新增        |                                               |                                                                                      |                                                                              |
|                                  | HXZG_SB_00044                                 | SWZJ.HXZG.SB.ZZSXGMSBSQJKJHQQCSJ                                                     | 增值税小规模申报事前监控及获取期初数据                                       |
|                                  | HXZG_SB_00045                                 | SWZJ.HXZG.SB.BCZZSXGMSB                                                              | 保存增值税小规模申报                                                         |
|                                  | HXZG_SB_00492                                 | SWZJ.HXZG.SB.SZPMSBZTSBQXXXCX                                                        | 税种品目的申报状态、申报期限信息查询                                         |
|                                  | HXZG_ZS_10006                                 | SWZJ.HXZG.ZS.CXYZQSXXBYDJXHYZPZXH                                                    | 查询应征欠税信息                                                             |
|                                  | HXZG_ZS_10025                                 | SWZJ.HXZG.ZS.SKYSKJN                                                                 | 税库银三方协议提交缴款请求（税收）                                           |
|                                  | HXZG_SB_00067                                 | SWZJ.HXZG.SB.BCSBZF                                                                  | 保存申报作废                                                                 |
| 税收完税证明                     |                                               |                                                                                      |                                                                              |
|                                  | HXZG_ZS_00330                                 | SWZJ.HXZG.ZS.CXWHKDZJFJL                                                             | 查询未开过的电子缴费记录                                                     |
|                                  | HXZG_ZS_00331                                 | SWZJ.HXZG.ZS.UPDATEWSPZHKJL                                                          | 更新完税凭证换开记录                                                         |
|                                  | HXZG_ZS_10039                                 | SWZJ.HXZG.ZS.ZFZKSSWSZMXX                                                            | 作废税收完税证明信息                                                         |
|                                  | HXZG_PZ_00039                                 | SWZJ.HXZG.PZ.CXPZJCBYSWRYPLZL                                                        | 根据税务人员和票证种类查询结存                                               |
| 车购税(包含税收完税证明所有权限) |                                               |                                                                                      |                                                                              |
|                                  | GSGL_SB_00001                                 | SWZJ.GSGL.SB.CXZRRDJXXWBXT                                                           | 查询自然人登记信息                                                           |
|                                  | GSGL_DJ_00001                                 | SWZJ.HXZG.DJ.ZRRJJDJ SWZJ.GSGL.DJ.BCZRRGJXXJJDJFW                                    | 自然人关键信息间接登记服务(先申请蓝色如有问题更换为黑色的，或直接两个都申请) |
|                                  | HXZG_DJ_00004                                 | SWZJ.HXZG.DJ.CXNSRXXBYDJXHORNSRSBH                                                   | 根据登记序号或纳税人识别号查询纳税人信息                                     |
|                                  | HXZG_DJ_00073                                 | SWZJ.HXZG.DJ.BCZZLSSWDJXX                                                            | 保存组织临时登记纳税人信息                                                   |
|                                  | HXZG_PZ_00039                                 | SWZJ.HXZG.PZ.CXPZJCBYSWRYPLZL                                                        | 根据税务人员和票证种类查询结存                                               |
|                                  | HXZG_SB_00067                                 | SWZJ.HXZG.SB.BCSBZF                                                                  | 保存申报作废                                                                 |
|                                  | HXZG_SB_00081                                 | SWZJ.HXZG.SB.ClgzsClsbdhJk                                                           | 车辆购置税车辆识别代号监控                                                   |
|                                  | HXZG_SB_00082                                 | SWZJ.HXZG.SB.CxClgzsCxCjxx                                                           | 查询车辆购置税车型车价信息                                                   |
|                                  | HXZG_SB_00083                                 | SWZJ.HXZG.SB.ClgzsJs                                                                 | 车辆购置税计税                                                               |
|                                  | HXZG_SB_00084                                 | SWZJ.HXZG.SB.BcClgzssb                                                               | 保存车辆购置税申报                                                           |
|                                  | HXZG_SB_00087                                 | SWZJ.HXZG.SB.CxClgzswszmxxByClsbdh                                                   | 根据车辆识别代号查询车辆购置税完税证明信息                                   |
|                                  | HXZG_SB_00088                                 | SWZJ.HXZG.SB.BcClgzsffxx                                                             | 保存并打印车辆购置税完税证明发放                                             |
|                                  | HXZG_SB_00664                                 | SWZJ.HXZG.SB.CXCLWSZM                                                                | 查询车辆购置税完税证明信息                                                   |
|                                  | HXZG_SB_00665                                 | SWZJ.HXZG.SB.ZFCLWSZM                                                                | 作废车辆购置税完税证明信息                                                   |
|                                  | HXZG_SB_00808                                 | SWZJ.HXZG.SB.CXZJJSJGXXANDXJRQ                                                       | 查询申报车辆的最低计税价格及限缴日期                                         |
|                                  | HXZG_ZS_00331                                 | SWZJ.HXZG.ZS.UPDATEWSPZHKJL                                                          | 更新完税凭证换开记录                                                         |
|                                  | HXZG_ZS_10006                                 | SWZJ.HXZG.ZS.CXYZQSXXBYDJXHYZPZXH                                                    | 查询应征欠税信息                                                             |
|                                  | HXZG_ZS_10007                                 | SWZJ.HXZG.ZS.DYYHDJKPZ                                                               | 打印银行端缴款凭证                                                           |
|                                  | HXZG_ZS_10008                                 | SWZJ.HXZG.ZS.CXYHDJKPZWJKXX                                                          | 查询银行端缴款凭证未缴款信息                                                 |
|                                  | HXZG_ZS_10028                                 | SWZJ.HXZG.ZS.SKYDZSPKKZTCX                                                           | 税库银电子税票扣款状态查询（实时扣款，批量扣款，银行端缴款，POS刷卡）        |
|                                  | HXZG_ZS_10039                                 | SWZJ.HXZG.ZS.ZFZKSSWSZMXX                                                            | 作废税收完税证明信息                                                         |
|                                  | HXZG_ZS_10065                                 | SWZJ.HXZG.ZS.YBZSKPFPTOJK                                                            | 保存税收缴款书(税务收现专用)信息                                             |
|                                  | HXZG_ZS_10127                                 | SWZJ.HXZG.ZS.CXWHKDZJFJL                                                             | 查询未开过的电子缴费记录                                                     |
|                                  | HXZG_SB_00080                                 | SWZJ.HXZG.SB.ClhgzxxDrAndJk                                                          | 车辆合格证信息扫描导入及监控                                                 |
|                                  | HXZG_SB_00096                                 | SWZJ.HXZG.SB.IsHgzTrue                                                               | 车辆合格证真伪检测                                                           |

服务器资源
==========

| 序号 | 推荐配置                            | 操作系统                 | 网络     | 用途            | IP | 用户名密码 |
|------|-------------------------------------|--------------------------|----------|-----------------|----|------------|
| 1    | CPU：4（双核+） 内存：8G 硬盘：500G | Windows 2003 /LINUX /AIX | 税务内网 | 数据库          |    |            |
| 2    | CPU：4（双核+） 内存：8G 硬盘：500G | Windows 2003 /LINUX /AIX | 税务内网 | 应用            |    |            |
| 3    |                                     | windows                  | 税务内网 | 开发测试使用    |    |            |
| 4    |                                     | windows                  | 税务内网 | 开发测试使用    |    |            |
| 5    |                                     | windows32位操作系统      |          | 解密服务dll使用 |    |            |
