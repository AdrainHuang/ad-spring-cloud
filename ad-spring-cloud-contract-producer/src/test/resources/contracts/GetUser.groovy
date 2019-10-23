package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    name 'should_return_user'  //最终生成测试时的方法名，默认是文件名
    request {
        method 'GET'
        url value(
                consumer(regex('/users/\\d+')),
                producer('/users/1'))
    }
    response {
        status 200
        body([
                id      : 1L,
                username: "adrain",
        ])
        headers {
            contentType(applicationJsonUtf8())
        }
    }
}