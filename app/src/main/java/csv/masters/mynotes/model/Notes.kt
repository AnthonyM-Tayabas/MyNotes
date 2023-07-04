package csv.masters.mynotes.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Notes(
    var title: String,
    var description: String? = null,
    var dateAdded: String
): Parcelable
