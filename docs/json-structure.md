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
  "employee": {
    "id": 8
  },
  "product": {
    "id": 8
  },
  "salePrice": 33.00
}
```