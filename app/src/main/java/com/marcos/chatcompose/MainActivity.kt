package com.marcos.chatcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.marcos.chatcompose.itemlista.UsuarioItem
import com.marcos.chatcompose.model.Usuario
import com.marcos.chatcompose.ui.theme.ChatComposeTheme
import com.marcos.chatcompose.ui.theme.GREEN200
import com.marcos.chatcompose.ui.theme.WHITE

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ChatComposeTheme {
              Scaffold(
                  topBar = {
                      TopAppBar(
                          backgroundColor = GREEN200,
                          title = {
                              Text(text = "Chat")
                          },
                          contentColor = WHITE
                      )
                  },
                  backgroundColor = WHITE
              ) {
                ListaUsuarios()
              }
            }
        }
    }
}


@Composable
fun ListaUsuarios(){

    val context = LocalContext.current

    val listaUsuarios: MutableList<Usuario> = mutableListOf(
        Usuario("Rone Cleyton Castro Costa",R.drawable.homem),
        Usuario("Maria da Silva",R.drawable.mulher),
        Usuario("Marcos Duarte Gomes",R.drawable.homem),
        Usuario("Rone Cleyton Castro Costa",R.drawable.homem),
        Usuario("Maria da Silva",R.drawable.mulher),
        Usuario("Marcos Duarte Gomes",R.drawable.homem),
        Usuario("Rone Cleyton Castro Costa",R.drawable.homem),
        Usuario("Maria da Silva",R.drawable.mulher),
        Usuario("Marcos Duarte Gomes",R.drawable.homem),
        Usuario("Rone Cleyton Castro Costa",R.drawable.homem),
        Usuario("Maria da Silva",R.drawable.mulher),
        Usuario("Marcos Duarte Gomes",R.drawable.homem)
    )

    LazyColumn{
        itemsIndexed(listaUsuarios){position,_ ->
            UsuarioItem(listaUsuarios = listaUsuarios, position = position, context = context )
        }
    }

}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ChatComposeTheme {

    }
}