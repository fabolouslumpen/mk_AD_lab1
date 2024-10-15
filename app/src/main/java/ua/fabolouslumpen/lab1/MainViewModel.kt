package ua.fabolouslumpen.lab1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    private val _text = MutableLiveData<String>()
    val text: LiveData<String> = _text

    private lateinit var randomTexts: List<String>

    fun setTexts(texts: List<String>) {
        randomTexts = texts
    }

    fun changeText() {
        val currentText = _text.value
        var newText: String?

        do {
            newText = randomTexts.random()
        } while (newText == currentText)
        _text.value = newText
    }
}