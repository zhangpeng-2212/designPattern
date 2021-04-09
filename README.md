#CCUAP - CityCloud Universal Application Platform
&emsp;&emsp;随着公司智慧城市相关业务的快速发展，对项目团队在快速响应业务发展的需求和变化的能力上提出了更高的要求。
&emsp;&emsp;项目团队需要快速应变、快速开发新产品，从而提高管理水平、控制项目风险、提高企业盈利，这些都需要一个统一、高效、高质量的研发平台来保障。
&emsp;&emsp;另外，目前研发团队中技术框架都不一致，相互之间的技术成果基本不能共享，更没有积累和形成自己的技术知识库。
&emsp;&emsp;统一研发平台的提出，可以逐步解决这些问题。

## 架构图
![enter description here][1]
## 组成图
![enter description here][2]
## 主要功能

* 建立统一的技术架构和规范，遵循统一的技术架构和规范来进行项目和产品研发。
* 提供3套基础技术框架（前端、后端和移动端）+1个不断完善的组件库，从而降低开发的技术要求，提升项目和产品的质量。
* 实现基础核心通用模块，基本满足项目和产品需求，使开发人员更加关注业务逻辑实现。
* 实现一套代码构件工具，可以快速生成指定形式的前后端代码。
* 提供权限、日志、参数、消息、任务调度、工作流等基础模块。
* 引入元数据、数据模型、数据服务、可视化设计等，使某些模块无需编码，通过实施即可完成。
* 集成高性能kong网关，可通过插件进行功能扩展。
* 实现多种数据源之间的数据交换功能，支持全量和增量交换，支持任务处理节点横向扩展。

## 公共组件和公共模块

**[ccuap-framework](https://git.citycloud.com.cn:3000/ccuap/ccuap_backcode/src/master/ccuap-framework)**：数据访问、分布式事务、分布式锁、json、校验、辅组类等。

**[ccuap-framework-jpa](https://git.citycloud.com.cn:3000/ccuap/ccuap_backcode/src/master/ccuap-framework-jpa)**：基于jpa的orm。

**[ccuap-common](https://git.citycloud.com.cn:3000/ccuap/ccuap_backcode/src/master/ccuap-common)**：springboot配置、openapi核心、日志、异常、分布式数据同步、文件上传等。

**[ccuap-common](https://git.citycloud.com.cn:3000/ccuap/ccuap_backcode/src/master/ccuap-web)**：基于springboot mvc的封装，处理页面请求。

**[ccuap-sys](https://git.citycloud.com.cn:3000/ccuap/ccuap_backcode/src/master/ccuap-sys)**：系统管理服务，包括多组织用户架构、基于角色的权限模型、参数管理、日志管理等。

**[ccuap-auth](https://git.citycloud.com.cn:3000/ccuap/ccuap_backcode/src/master/ccuap-auth)**：h4a、cas、oauth2外部认证对接。

**[ccuap-websocket](https://git.citycloud.com.cn:3000/ccuap/ccuap_backcode/src/master/ccuap-websocket)**：对websocket进行封装，登录系统的用户可以通过websocket接受消息。

**[ccuap-plugins-message](https://git.citycloud.com.cn:3000/ccuap/ccuap_backcode/src/master/ccuap-plugins-message)**：基于ccuap-websocket的消息管理，可发送站内消息、邮件等。

**[ccuap-mail](https://git.citycloud.com.cn:3000/ccuap/ccuap_backcode/src/master/ccuap-mail)**：提供邮件服务。

**[ccuap-task](https://git.citycloud.com.cn:3000/ccuap/ccuap_backcode/src/master/ccuap-task)**：分布式任务调度框架，可通过界面配置和管理调度任务。

**[ccuap-plugins-tools](https://git.citycloud.com.cn:3000/ccuap/ccuap_backcode/src/master/ccuap-plugins-tools)**：代码构建工具，可根据数据库结构生成符合CCUAP的前后端代码。

**[ccuap-plugins-activiti](https://git.citycloud.com.cn:3000/ccuap/ccuap_backcode/src/master/ccuap-plugins-activiti)**：基于activiti的工作流管理，组和人员已与CCUAP打通。

更多组件请参考 [Roadmap](https://github.com/alibaba/spring-cloud-alibaba/blob/master/Roadmap-zh.md)。

## 如何构建

* master 分支对应的是 Spring Boot 2.2，最低支持 JDK 1.8。

CCUAP 使用 Maven 来构建，最快的使用方式是将本项目 clone 到本地，然后执行以下命令：

	mvn -Dmaven.test.skip=true clean install

执行完毕后，项目将被安装到本地 Maven 仓库。

## 如何使用

### 如何引入依赖

如果需要使用已发布的版本，在 `dependencyManagement` 中添加如下配置。

	<dependencyManagement>
        <dependencies>
            <dependency>
                <groupId>com.citycloud</groupId>
                <artifactId>ccuap</artifactId>
                <version>1.1.8</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
        </dependencies>
    </dependencyManagement>

然后在 `dependencies` 中添加自己所需使用的依赖即可使用。

## 演示 Demo

为了演示如何使用，CCUAP 项目包含了一个子模块`ccuap-examples`。

Example 列表：

[Mybatis Example](https://git.citycloud.com.cn:3000/ccuap/ccuap_backcode/src/master/ccuap-examples-mybatis)


## 技术交流

### 致得共享区

[统一研发平台](http://zd.citycloud.com.cn:8003/index.html#/document/list.html?folderId=477907&treeName=pubDocTree)

### 邮件列表

ccuap@citycloud.com.cn，欢迎通过此邮件列表讨论与 ccuap 相关的一切。


  [1]: ./images/1599183321202.jpg "1599183321202.jpg"
  [2]: ./images/1599183396552.jpg "1599183396552.jpg"