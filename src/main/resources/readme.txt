说明：	 life-api存放所有接口，因为需要将接口暴露给消费者，依赖life-entity
         life-core存放第三方jar包，后期存放一些公共Utils工具包；
         life-server服务提供者的启动方法，本文中实现了一些接口用于测试，依赖life-api、life-core
         life-web为服务消费者，是个web工程，依赖life-api、life-core
         life-entity存放实体bean，后期可存储model