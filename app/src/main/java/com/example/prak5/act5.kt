package com.example.prak5

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import android.R.attr.top
import androidx.compose.runtime.setValue

@Composable
fun FormDataDiri(modifier: Modifier){
    //variabel-variabel untuk mengingat nilai masukan dari keyboard
    var textNama by remember {mutableStateOf(value="")}
    var textAlamat by remember { mutableStateOf(value ="")}
    var textJK by remember {mutableStateOf(value ="")}

    //variabel-variabel untuk menyimpan data yang diperoleh dari komponen UI
    var nama by remember {mutableStateOf(value ="")}
    var alamat by remember {mutableStateOf(value ="")}
)
    Column(modifier: Modifier.padding(top = 50.dp),) { }
}