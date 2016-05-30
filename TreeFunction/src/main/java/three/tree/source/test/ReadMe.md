        HashMap<String, String> map = new HashMap<String, String>();
        map.put("file1", "some_file1");
        map.put("file2", "some_file2");
        map.put("file3", "some_file3");

        String result = (new Gson()).toJson(map);


  Output:

       {
           "file2": "some_file2",
           "file3": "some_file3",
           "file1": "some_file1"
       }
