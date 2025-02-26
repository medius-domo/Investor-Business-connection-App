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
fun RegisterScreen(onNavigateToLogin: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(painter = painterResource(Res.drawable.logo), contentDescription = "App Logo")
        Spacer(modifier = Modifier.height(16.dp))

        var name by remember { mutableStateOf("") }
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        var confirmPassword by remember { mutableStateOf("") }

        OutlinedTextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("Full Name") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))

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
        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = confirmPassword,
            onValueChange = { confirmPassword = it },
            label = { Text("Confirm Password") },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { /* Handle registration */ },
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Sign Up", fontSize = 18.sp)
        }

        Spacer(modifier = Modifier.height(8.dp))

        TextButton(onClick = onNavigateToLogin) {
            Text("Already have an account? Login")
        }
    }
}






//@Composable
//fun RegisterScreen(onNavigateToLogin: () -> Unit) {
//    Column(
//        modifier = Modifier.fillMaxSize().padding(16.dp),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center
//    ) {
//        // Input Fields
//        var name by remember { mutableStateOf("") }
//        var email by remember { mutableStateOf("") }
//        var password by remember { mutableStateOf("") }
//
//        OutlinedTextField(value = name, onValueChange = { name = it }, label = { Text("Full Name") })
//        Spacer(modifier = Modifier.height(8.dp))
//        OutlinedTextField(value = email, onValueChange = { email = it }, label = { Text("Email") })
//        Spacer(modifier = Modifier.height(8.dp))
//        OutlinedTextField(value = password, onValueChange = { password = it }, label = { Text("Password") })
//        Spacer(modifier = Modifier.height(16.dp))
//
//        // Sign Up Button
//        Button(onClick = { /* Handle Sign Up */ }, modifier = Modifier.fillMaxWidth()) {
//            Text("Sign Up")
//        }
//
//        Spacer(modifier = Modifier.height(8.dp))
//
//        // Navigate back to Login Screen
//        TextButton(onClick = onNavigateToLogin) {
//            Text("Already have an account? Login")
//        }
//    }
//}
