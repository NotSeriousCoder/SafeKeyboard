# SafeKeyboard    

~~
private KeyBoardDialogUtils keyBoardDialogUtils;
private EditText et;
et = findViewById(R.id.et_ssssss);
        keyBoardDialogUtils = new KeyBoardDialogUtils(this);
        et.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                keyBoardDialogUtils.show(et, "ssss");
            }
        });
~~
