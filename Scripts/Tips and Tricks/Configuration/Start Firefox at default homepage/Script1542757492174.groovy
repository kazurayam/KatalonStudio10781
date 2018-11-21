import com.common.utils.SetDesiredCapability
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

Map firefoxDC = [:]
firefoxDC.put('browser.startup.homepage' , 'https://katalon.com')
SetDesiredCapability.firefox(firefoxDC)
assert WebUI.getWindowTitle() == 'Katalon Studio: Simplify API, Web, Mobile Automation Tests'
WebUI.closeBrowser()
