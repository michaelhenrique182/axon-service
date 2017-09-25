package org.learn.axonframework.coreapi

import org.axonframework.commandhandling.TargetAggregateIdentifier

//model
data class ProductInfo(val productId: String = "", val comment: String = "", val price: Int = 0)


class FileOrderCommand(@TargetAggregateIdentifier val orderId: String, val productInfo : ProductInfo)

class OrderFiledEvent(val orderId: String, val productInfo : ProductInfo)


class PrepareShipmentCommand(@TargetAggregateIdentifier val orderId: String, val productInfo: ProductInfo)

class ShipmentPreparedEvent(val shipmentId: String, val orderId: String, val price: Int)