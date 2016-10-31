# billingservice
Sample service to calculate and split bipost the required details to get the bill split amount among customers as the response.
This is a gradle project.

Sample url: <host>:8003/billing/split

Available apis:
POST /billing/split : post the required details to get the bill split amount among customers as the response.
Basic input validations are in place,with approriate response code.
Sample Request:
```

{
	"splitType": "percentage",
	"totalAmount": 125,
	"details": [
		{
			"customerId": "12345",
			"share": 10
		},
      {
			"customerId": "12346785",
			"share": 45
		}
	]
}
```
Sample response:
```
{
	"totalAmount": 125,
	"balanceAmount": 57,
	"details": [
		{
			"customerId": "12345",
			"share": 12
		},
		{
			"customerId": "12346785",
			"share": 56
		}
	]
}
```
