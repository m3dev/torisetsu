package core

import data.Diagnosis

interface Result {
    fun getDiagnosis(resultId: Int): Diagnosis
}