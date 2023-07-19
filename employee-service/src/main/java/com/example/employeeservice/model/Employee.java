package com.example.employeeservice.model;

public record Employee(Long id, Long department_id, String name, int age, String position) {
}
