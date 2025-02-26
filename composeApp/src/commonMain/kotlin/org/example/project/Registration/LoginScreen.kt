package org.example.project.Registration


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import inversbridge.composeapp.generated.resources.Res
import inversbridge.composeapp.generated.resources.logo
import org.jetbrains.compose.resources.painterResource

@Composable
fun LoginScreen(onNavigateToRegister: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(Res.drawable.logo),
            contentDescription = "App Logo")
        Spacer(modifier = Modifier.height(16.dp)
        )

        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }

        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Email") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Password") },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { /* Handle login */ },
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Login", fontSize = 18.sp)
        }

        Spacer(modifier = Modifier.height(8.dp))

        TextButton(onClick = onNavigateToRegister) {
            Text("Don't have an account? Sign Up")
        }
    }
}



//
//@Composable
//fun LoginScreen(onNavigateToRegister: () -> Unit) {
//    Column(
//        modifier = Modifier.fillMaxSize().padding(16.dp),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center
//    ) {
//        // Input Fields
//        var email by remember { mutableStateOf("") }
//        var password by remember { mutableStateOf("") }
//
//        OutlinedTextField(value = email, onValueChange = { email = it }, label = { Text("Email") })
//        Spacer(modifier = Modifier.height(8.dp))
//        OutlinedTextField(value = password, onValueChange = { password = it }, label = { Text("Password") })
//        Spacer(modifier = Modifier.height(16.dp))
//
//        // Login Button
//        Button(onClick = { /* Handle Login */ }, modifier = Modifier.fillMaxWidth()) {
//            Text("Login")
//        }
//
//        Spacer(modifier = Modifier.height(8.dp))
//
//        // Navigate to Registration Screen
//        TextButton(onClick = onNavigateToRegister) {
//            Text("Don't have an account? Sign Up")
//        }
//    }
//}
