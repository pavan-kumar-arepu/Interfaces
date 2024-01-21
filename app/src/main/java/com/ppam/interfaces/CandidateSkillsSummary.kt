package com.ppam.interfaces

class CandidateSkillsSummary: Secondary(), Archer, Singer {
    override fun archery() {
        super.archery()
        println("Archery skills enhanced!")
    }

    override fun sing() {
        super.sing()
        println("Enhannced Skills of Singing too!")
    }
}