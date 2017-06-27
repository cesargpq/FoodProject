package com.upn.foodapp.Entity

/**
 * Created by CESARGPQ on 27/06/2017.
 */

data class Menu(var nombre: String, var precio: Double, var tipo: Int)

class Pedido(var menu: Menu, var cantidad: Int){
    fun subTotal():Double{
        return menu.precio*cantidad
    }
}

data class usuario(var userName: String, var password: String)