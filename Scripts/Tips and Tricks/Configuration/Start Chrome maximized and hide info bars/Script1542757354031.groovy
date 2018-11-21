import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


List desiredCapabilities = []
desiredCapabilities.add("--start-maximized")
desiredCapabilities.add("--disable-infobars")
CustomKeywords.'com.common.utils.SetDesiredCapability.chrome'(desiredCapabilities)
WebUI.navigateToUrl('https://katalon.com/')
WebUI.closeBrowser()
