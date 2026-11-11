# JSON Structure

## 1. Products

```json
{
  "id_prod": 1,
  "type_prod": "type_example",
  "name_prod": "name_example",
  "date_created": "2026-11-10T20:00:00",
  "cost_price": 15.00,
  "selling_price": 33.00
}
```

## 2. Employees

```json
{
  "id_emp": 1,
  "name_emp": "name_example",
  "date_created": "2026-11-10T20:00:00",
  "function_emp": "function_example"
}
```

## 3. Sales

```json
{
  "id_sale": 1,
  "id_emp": 1,
  "id_prod": 1,
  "date_sale": "2026-11-10T20:30:00",
  "sale_price": 33.00
}
```