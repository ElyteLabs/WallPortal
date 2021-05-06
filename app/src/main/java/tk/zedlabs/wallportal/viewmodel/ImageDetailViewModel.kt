package tk.zedlabs.wallportal.viewmodel

import android.graphics.Bitmap
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import tk.zedlabs.wallportal.models.ImageDetails
import tk.zedlabs.wallportal.persistence.BookmarkDao
import tk.zedlabs.wallportal.repository.ImageDetailsRepository
import tk.zedlabs.wallportal.util.FileUtils
import javax.inject.Inject

@HiltViewModel
class ImageDetailViewModel @Inject constructor(
    private val fileUtils: FileUtils,
    private val bookmarksDao: BookmarkDao,
    private val repository: ImageDetailsRepository
) : ViewModel() {

    val isBookmark = MutableLiveData<Boolean>().apply { this.value = false }



}