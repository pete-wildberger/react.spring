
var path = require('path');

module.exports = {
    entry: './src/main/js/app.js',
    devtool: 'sourcemaps',
    cache: true,
    debug: true,
    output: {
        path: path.resolve(__dirname, "target") + "/classes/static/built/",
        filename: 'bundle.js'
    },
    module: {
        loaders: [
            {
                test: /\.js?/,
                include: path.resolve(__dirname, "src"),
                exclude: /(node_modules)/,
                loader: 'babel',
                query: {
                    cacheDirectory: true,
                    presets: ['es2015', 'react']
                }
            }
        ]
    }
};
