package payloads;

import generalUtilities.BaseTest;

public class Adyen_Payloads extends BaseTest {
public static String adyenPayloads() {
	
	Checkout_Payloads.addressDetails();
	
	        encryptedCardNumber= "adyenjs_0_1_25$mNJ2uegHw/NEFxLABE4wLkkNPmwFsfnUGViBtFJayPz9Gorq0VeA0Csp1f54B9IjsYB+XWP5kEQKo+6aOolRWzgur0N6hNmcf/01Urm0mcuscRplUksIy9ECr72XgnPy4JZ2lmng8aow3a+ZOBvWBZZTPMb7NLNh0JnYjmLI8qPZeCMQLu5LDRyBN/nRNvUZKSnku/pUZs6Gek7X5S1gcugTnc0K72SIp7shWGZ3Dz5qZfLgsslITONsABfcmNnYxWwxr5DvhVmTpN6bPv8vxUHH2D8f0EY7s0FvsMVmReLAs++xfa3w0Yr3HR1mfr8oQ9zbcXrIXslU/hH5DIU9ng==$ce3OfFimO2076HbIiV4gaN1CGMXCSNu2FTEOWCrPooCZtcSwd/lBZduuqJwO+iYfdnY75ltp1wcdSAAFMRzm7cnVT//BSPF04NrpJRei5Ilm496MuDrsRDVYFpIEk02U3QdEvS8b1U2Bbq3RMfuFlvGj+ekYkA11AkrcceCkEEHJHS///A84f84iZgKLZShgV1YhEP9YsRICPRtP/2yA4EPY45eEoHXm0O+/F0rNvGJpqQlHIe1hfEckgcJlaHGeWUoIjBgFycbAk3fkMVx73aLDx/NMarIqJFToBoe2ws5/3LH4zSyekrbqirMdTkwh+67lFvxWeruG/sqrGYfCekbIeRNlFxqHWXGhYqf14xwXDaTgfaA0o9ued5Cyb18T/UZ3ND0+nzEVHMQVRRz+ENg9R/pXKIwRiM0tNrs7ykOFi3e3rchbqYivI3mIzNrvHsb1LQSxGhdf3G7tIbcz2lbsBAAj9rukcq5Il8pn+Cum3jDNgRNdWrBUGJA5zEMP1fewZjL4tW/Go0ecZssEOTzOgUPFL2mhwyWXpDV6eGFUlXGbsNJUoFkZ8CBhzLXJcYgMZmJHPiw/uwiucRJ3crO3U+fy9k9AX2Hei8A3gNBkPIyWiPlwVmUOAGxw/ahsgQp85ue93dw2LI1JH/XBdDz6UiiBARj09tASpH9yaGNnFSRnhjrMPh3RrFk8lEPCy4VisWFYQ/4CgX7uCphUlQ43d6JiiEparL0SIV0tB6umDzBaaNcx7J3bejoPb4E4T88LnQvXR3ZhY2Icq7B3McGRLn0B6UZ8HgvsYgpHQ0jt6u1PHGl5owCTTHosoxznA1OcWsUG6cEZI3vHGN95sC+YurgRlwm87Fbpo8h0I1PRa4YeBl9i7huwjeVnkPwG/9Cc/eo+HaDVd1wqs2i82jUP8R/AGMwOcx8Hddcj84PgfSCyS1otIX3lSrDHHDCieevwdjycUmx5eveFlZHUum11UNdj5e7ar+zebzFKrvyJjYoBXZQ0KvjkgKegTwXdvurMCvDmSxfgxLgQqt+7+ddn7kO1FfdlLni/+WRGS05RWskaLuOhc9OceCQcHVL71L2yflF1s1Xaej58H/ntC1FKnMxzkCBBnmQEOZyJyam0tsniM/SLseXr+nK6/m5gQx3Hr1OybII+W7fo/kdGD+B7k7lhXLLyHOVJi08AOn4RZ3FD3Wjqez8rr46KaGQdiPwJ65Bu34r0+tjGTn2db9PT/y19X3zokkceF22unXHxjTijmBeZephJVzqqE8UAosq2wTTJzUKhV80lWZp29RcMwhOAVsbgHlPtFvV+bJzaZD406SEnvWPw2GaBNwTbkdSC42l8Mg==";
			encryptedExpiryMonth= "adyenjs_0_1_25$L0UTfMNg9nM6gzyp7kFNcT1xbuvKQbWNffvty9EyIHwkeWRfGl8TjThrb13pqFun9m1dEbgLfuil/Si2cwMzQzuQfoMuA8nRAKXFaAVc+f6CUNRvYSgiYX28jQAVwqvgxPh0YUEVn19UBEknidNXeMbvQ9x164BsEnz0baDSWCwz5m4eosqr+/tmGP/BBbddM4xbe1ETLyo89EVXRriFdkLyHrpJO9/Zjqt9b0k2cMi+8t/oodKWXFrJK76GNzlA4NxA90HCA16TlMQDoocAPCSkLD2TD7uN9bVFSpbskzQWIOPxKtMqmzmj+honF62BK8yxY89FiTyxIgs57Rf25Q==$LGqime8+bE07qik6fZ2rDJSHkg/pBSLjgeFEzfH6s2/omHmXEwuS18kEo5HctB3AFqhpESnU5MMI8MY4nSCLJA4Qu4j1brrgB4Wft4d1nt52FQNdcjn0eUNpP6xMKyuUsWencPlYDRyRv+0diRxHwqOd4vlQykl5Szq07WtqB58V55EN6O4rc2D1CVtQl40IOJyGGne31ddONJ9L3Oi50/K8TcePo7H9sfSzhw2C6RssuWE5hNeGd8MxcPyP7rc8ipQa4O6YH0TulUZCCboGuMLeOYYJZd757pT8oERjuTBAOez3XRxz0Hg8muIZbmp/IFW6d3m6Ppj58L+7zsKEt+hvIk5cEDEhfQVDb+AKhzUyMp50e/kiX3bkpb207o0vX8Vz3Q4MWLQgyccsPhlJSYjY4c8/e0yQnfIrYWD6XFA0axE0N9uy1pgy5BboVAWt+JmBiWnRPnJtk6+DR74G/72G4efTL/PImCLwIQRaSdP5QQg+GmuJw6eSMbZRASi+BEabWbNZdVbhKb11eYuLQQoUc7ZJ2n5I4zHV";
			encryptedExpiryYear= "adyenjs_0_1_25$s/1z8hQDwbB+YqZDYHIheEkJFA4pCt4/wvXYy9ArmyYvJbNlvfYT9gkEfrzQqgVXhS6GIKum5bmIWrBYWKhBLsKpRcvhdOZ52pLD2EQEEYlOgfKPl1S+QT+eTEsIs+NZIh13fJEAzaT7oNoQvg+a69UdIzyBDuIxBGgjl+5EHi+wV+Cfs+cXGAlTBFmm+Ze7gBfzB7C6FhzsTCvB79kQxPZCfKeUq8v09M3g6csdxO4nxZBzi+xGIt7RDmGLmrZY26yHB8XW0pguJctbo0ojdTrP/FoNXeFJmNjgGmZeLYxz01mAstIXYTbKDKOqCZTHPvt35n+oXRO/AhceIHQF5Q==$Falh4WtJ6FOYidB/lZtAy4hM6WSG63s2ZsP4gf0SzHbz8OO9HeTNEfwAMz2x/2Na3aaiVdE+kV8v6EHjdp0l6/tvBD1ngCJOe4K9D5XtOt0tEpsXbJ9+/1fc5QbF6Tv6iBRofETeWfcDgJTMBNW9Achgh8J5DgqZ159QIwqH3XC3Y0/BV5+Y9uDrLAkb++TFdewIRcXFhchpQzjgjVhG7IhiVcavQVU0IQbAFGjZEmzk1dp36APZ1Op6sEbbzoJK6LlMxnyYohoojg21lKrh1STq7p7eo0jSOUFWgH/aM7Ew8RAypKGXjnO1q/Uu6q1A8dsiXL/xHGBdJG3uZKusDeSTXXhuKoh/zb69OAviwtfkCRJaTsLzK2mZFl+Vk1YSlym9xxIyrRhXkCm+M+mQHdWBUiMAJCUmODScbM+AM04cBYtPLtQ/h5tiWYQMkA1YlktmNyYdbmyL19elqa7DhpexBXrNrdC9PokLDBYKjJbNO7SQNNApnFw1IBc07/4vkqD56xhtgXErFfQzIl4+MPUhHbGFU/Rc3OwzgQ==";
			encryptedSecurityCode= "adyenjs_0_1_25$04Fzp1m1ZsVUqI86Xuw4985ziLlmvZ3PLit0YYF1F26zIl6KGJDdRXe4qym7TPdeEg7o0yJxjzwgdSuQL6tlYuRau4wTRa7ExqIEqI1bKPXdxp0fHwlO12rGs/lotBvVr5e6GKxp6IS5pbX8KbH1ZKpS+hIqlc8rcyKbEO/e/JplAN4dqSdIFzYYUr450uYa2hGtxYA5AyEFn5QbnVpirgbSe9/iU8bWjS6zlMUDNnmPhwLsLM+dKp/b7qc7RrpSJd19kLwTSpc4cCR9Im66LmdlqG7FkOV2ZzYOgvku8E+n8W98LSo/+RAWTTSq6yU6ADeGrTb2d/7mSnr+uIb1Fg==$lFQP9hWmms+jShUqytUmzh82XbLAl+63g+We7zK1nnsNEt8w8qSm5/FlH7MLCP8ITtuANFIotOXUr7+wvV3Al6NIja5Y5tfnZ7gKmQFryPU594DKKIgeUWBQtCwjRfHKagvleRgtxrntUtSP4S9dM1QDpErDtqr83c2KLV1q+rGKbiMg3xbwjdSc6/mF3B4y8P9d+LhtvLYlMwWYtPIgDZA7+9si2F++HpMMo+q6xS96yF6blnceIpMy9S8t/xFFe1Cdim/ILBN8XVVqvpGFNiMXXU5j761RQ7BFlmXkxKzILak/bhK+YFOhToJHvwJ9qFhk5FQvih+cKCMtdQH3TVxhGpuQknVoVuciNQJyeTjXAS3EpxiteP3WFAjPThZYEY4iQNr/qxbP8W5Wv3aGyEI20O/Ll3CVExtMO/b8aEL2cyETrd4RXhndjPPG9JUz7azSqoYECz/8I2LjfYJekWJGz8n+as9EryWMNRr0scDqaE9EV0wYYE1zEVaijZ8IdUWc";
	 adyenBody = "{\r\n" + 
			"  \"merchantAccount\": \"LecreusetSFCC_UK\",\r\n" + 
			"  \"reference\": \""+orderID+"\",\r\n" + 
			"  \"browserInfo\": {\r\n" + 
			"    \"acceptHeader\": \"*/*gzip, deflate, br\",\r\n" + 
			"    \"userAgent\": \"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/78.0.3904.108 Safari/537.36\"\r\n" + 
			"  },\r\n" + 
			"  \"applicationInfo\": {\r\n" + 
			"    \"adyenPaymentSource\": {\r\n" + 
			"      \"name\": \"adyen-salesforce-commerce-cloud\",\r\n" + 
			"      \"version\": \"19.2.1\"\r\n" + 
			"    },\r\n" + 
			"    \"externalPlatform\": {\r\n" + 
			"      \"name\": \"SalesforceCommerceCloud\",\r\n" + 
			"      \"version\": \"SFRA\"\r\n" + 
			"    }\r\n" + 
			"  },\r\n" + 
			"  \"enableRecurring\": false,\r\n" + 
			"  \"enableOneClick\": false,\r\n" + 
			"  \"returnUrl\": \"https://development-eu01-lecreuset.demandware.net/on/demandware.store/Sites-lecUK-Site/en/Adyen-OrderConfirm\",\r\n" + 
			"  \"amount\": {\r\n" + 
			"    \"currency\": \"GBP\",\r\n" + 
			"    \"value\": "+OrderTotal+"\r\n" + 
			"  },\r\n" + 
			"  \"countryCode\": \""+countrycode+"\",\r\n" + 
			"  \"deliveryAddress\": {\r\n" + 
			"    \"city\": \""+city+"\",\r\n" + 
			"    \"country\": \""+countrycode+"\",\r\n" + 
			"    \"houseNumberOrName\": \"\",\r\n" + 
			"    \"postalCode\": \""+postalcode+"\",\r\n" + 
			"    \"stateOrProvince\": \""+statecode+"\",\r\n" + 
			"    \"street\": \""+street+"\"\r\n" + 
			"  },\r\n" + 
			"  \"billingAddress\": {\r\n" + 
			"    \"city\": \""+city+"\",\r\n" +
			"    \"country\": \""+countrycode+"\",\r\n" +
			"    \"houseNumberOrName\": \"\",\r\n" + 
			"    \"postalCode\": \""+postalcode+"\",\r\n" + 
			"    \"stateOrProvince\": \""+statecode+"\",\r\n" + 
			"    \"street\": \""+street+"\"\r\n" +  
			"  },\r\n" + 
			"  \"paymentMethod\": {\r\n" + 
			"    \"type\": \"scheme\",\r\n" + 
			"    \"encryptedCardNumber\": \""+encryptedCardNumber+"\",\r\n" + 
			"    \"encryptedExpiryMonth\": \""+encryptedExpiryMonth+"\",\r\n" + 
			"    \"encryptedExpiryYear\": \""+encryptedExpiryYear+"\",\r\n" + 
			"    \"encryptedSecurityCode\": \""+encryptedSecurityCode+"\",\r\n" + 
			"    \"holderName\": \""+CardHolderName+"\"\r\n" + 
			"  },\r\n" + 
			"  \"shopperEmail\": \""+email+"\",\r\n" + 
			"  \"shopperName\": {\r\n" + 
			"    \"firstName\": \""+firstname+"\",\r\n" + 
			"    \"gender\": \"UNKNOWN\",\r\n" + 
			"    \"infix\": \"\",\r\n" + 
			"    \"lastName\": \""+lastname+"\"\r\n" + 
			"  },\r\n" + 
			"  \"shopperIP\": \"115.160.251.10\",\r\n" + 
			"  \"shopperLocale\": \"en\"\r\n" + 
			"}";
	return adyenBody;
}
}
