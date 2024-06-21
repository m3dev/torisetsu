package core

import data.Diagnosis

interface Result {
    fun getDiagnosis(resultPathName: String): Diagnosis?
}