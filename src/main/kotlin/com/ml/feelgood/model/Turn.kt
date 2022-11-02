package com.ml.feelgood.model

import com.ml.feelgood.model.store.Service
import java.time.LocalDate

class Turn {

    lateinit var id : String
    lateinit var date : LocalDate
    lateinit var storeId:  String
    lateinit var service: Service
    lateinit var clientId:  String
    lateinit var state : TurnState
}
