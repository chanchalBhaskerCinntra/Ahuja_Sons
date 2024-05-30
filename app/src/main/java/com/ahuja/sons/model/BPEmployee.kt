package com.ahuja.sons.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class BPEmployee(
    val Address: String,
    val CardCode: String,
    val CreateDate: String,
    val CreateTime: String,
    val DateOfBirth: String,
    val E_Mail: String,
    val Fax: String,
    val FirstName: String,
    val Gender: String,
    val InternalCode: String,
    val LastName: String,
    val MiddleName: String,
    val MobilePhone: String,
    val Position: String,
    val Profession: String,
    val Remarks1: String,
    val Title: String,
    val U_BPID: Int,
    val U_BRANCHID: String,
    val U_NATIONALTY: String,
    val UpdateDate: String,
    val UpdateTime: String,
    val id: Int
) : Parcelable