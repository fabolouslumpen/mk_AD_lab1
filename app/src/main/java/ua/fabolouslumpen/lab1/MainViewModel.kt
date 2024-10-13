package ua.fabolouslumpen.lab1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Hello World!"
    }
    val text: LiveData<String> = _text

    fun changeText() {
        val randomTexts = listOf(
            "Hello World!", "Welcome!", "Clicked!"
        )

        var newText: String
        do {
            newText = randomTexts.random()
        } while (newText == _text.value)

        _text.value = newText
    }
}