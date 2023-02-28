<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_Login        Kindly enter Login details_eadfbb</name>
   <tag></tag>
   <elementGuidId>666402c0-040c-4ece-a56e-2cc6f2341a2c</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//div[@id='modalLogin']</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>modal fade top show</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>id</name>
      <type>Main</type>
      <value>modalLogin</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tabindex</name>
      <type>Main</type>
      <value>-1</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>role</name>
      <type>Main</type>
      <value>dialog</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>aria-labelledby</name>
      <type>Main</type>
      <value>myModalLabel</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
        
            
            
                
                
                    
                        
    
        
        
        
        
        
        Login
        Kindly enter Login details below
        
        
            
            
                
            
            
            
                
                
                Your User ID

            
            
                
                
                Your Password

            
            
                Login 
            
            
            
                Forgot password/Customer ID? Click here
            
            
                
                    Resend Email Activation? Click here
                
            
        
    




    function loginAction() {
        var k = '84AD4B3A75B4E5F6';

        var txtUserName = $('#UserName').val();
        var txtpassword = $('#Password').val();

        if (txtUserName == '' || txtpassword == '') {

            $('#errorMessage').text('The username and password field is required.');
            $('#errorLogin').show();
            return;
        }

        $('#errorLogin').hide();
        var token = $('input[name=&quot;__RequestVerificationToken&quot;]').val();

        var key = CryptoJS.enc.Utf8.parse(k);
        var iv = CryptoJS.enc.Utf8.parse(k);

        var encryptedUsername = CryptoJS.AES.encrypt(CryptoJS.enc.Utf8.parse(txtUserName), key,
            {
                keySize: 128 / 8,
                iv: iv,
                mode: CryptoJS.mode.CBC,
                padding: CryptoJS.pad.Pkcs7
            });  

        var encryptedpassword = CryptoJS.AES.encrypt(CryptoJS.enc.Utf8.parse(txtpassword), key,
            {
                keySize: 128 / 8,
                iv: iv,
                mode: CryptoJS.mode.CBC,
                padding: CryptoJS.pad.Pkcs7
            });  

        //var lData = $('#login_form').serialize();
        var lData = {
            __RequestVerificationToken: token,
            UserName: encryptedUsername.toString(),
            Password: encryptedpassword.toString()
        };

        $.ajax({
            url: '/Home/Login',
            type: 'POST',
            data: lData,
            beforeSend: function () {
                // Show image container
                $(&quot;#loaderLogin&quot;).show();
                $(&quot;#loginBtn&quot;).prop(&quot;disabled&quot;, true);
            },
            success: function (response) {
                if (response.status == true) {
                    $('#errorLogin').hide();
                    window.open(response.redirectUrl, &quot;_self&quot;);
                }
                else {
                    $('#errorMessage').text(response.message);
                    $('#errorLogin').show();
                    $(&quot;#loaderLogin&quot;).hide();
                    $(&quot;#loginBtn&quot;).prop(&quot;disabled&quot;, false);
                }
            },
            error: function (errorResult) {
                $('#errorMessage').text(errorResult.message);
                $('#errorLogin').show();
                $(&quot;#loaderLogin&quot;).hide();
                $(&quot;#loginBtn&quot;).prop(&quot;disabled&quot;, false);
            },
            complete: function (data) {
                //// Hide image container
                //$(&quot;#loaderLogin&quot;).hide();
                //$(&quot;#loginBtn&quot;).prop(&quot;disabled&quot;, false);
            }
        });
        return false;
    };



                    
                
            
            
        
    </value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;modalLogin&quot;)</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:attributes</name>
      <type>Main</type>
      <value>//div[@id='modalLogin']</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Credit Direct Limited.'])[1]/following::div[2]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//body/div[3]</value>
   </webElementXpaths>
</WebElementEntity>
