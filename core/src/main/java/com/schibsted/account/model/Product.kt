package com.schibsted.account.model

import java.util.Date

data class Product(
    val productId: String,
    val parentProductId: String,
    val clientId: String,
    val type: String,
    val code: String,
    val name: String,
    val description: String,
    val url: String?,
    val price: String,
    val vat: String,
    val currency: String,
    val paymentOptions: String,
    val quantityLimit: String?,
    val quantityCount: String,
    val saleStart: Date,
    val saleStop: Date,
    val availableStart: Date?,
    val availableStop: Date?,
    val subscriptionPeriod: String,
    val subscriptionRenewPrice: String,
    val subscriptionRenewPeriod: String,
    val subscriptionAutoRenew: String,
    val subscriptionAutoRenewLockPeriod: String,
    val subscriptionAutoRenewDisabled: String,
    val subscriptionGracePeriod: String,
    val subscriptionEmailReceiptLimit: String,
    val subscriptionFinalEndDate: Date?,
    val allowMultiSales: String,
    val status: String,
    val changedBy: Date?,
    val changed: Date?,
    val createdBy: String,
    val created: Date,
    val purchaseUri: String
)